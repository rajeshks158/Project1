package com.mphasis.app;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.CommentsDAOImpl;
import dao.PostDAOImpl;
import dao.UserDAOImpl;
import model.Comments;
import model.Post;
import model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	PostDAOImpl pImpl = new PostDAOImpl();
	CommentsDAOImpl cImpl = new CommentsDAOImpl();
	UserDAOImpl uImpl = new UserDAOImpl();

//
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Post(Model model) {
		model.addAttribute("serverTime", new Date());
		return "/resources/signIn";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user(@RequestParam(value = "userName") String userName) {
		ModelAndView view = new ModelAndView("user");
		view.addObject("userName", userName);
		return view;
	}

//	@RequestMapping("/add")
//	public ModelAndView addPost() {
//
//		return new ModelAndView("add", "command", new Post());
//}
//	
//		 @RequestMapping(value = "/addPost", method = RequestMethod.POST)
//	
//	 public ModelAndView addPost(@RequestParam(value = "title","body") String title,String body)
//	 {
//	 
//	 int res = pImpl.insert(new Post(0,title,body));
//	  
//	  String result = (res == 1) ? "post added" : "post couldn't be added";
//	  ModelAndView view = new ModelAndView("result"); 
//	 view.addObject("result",result); 
//	  return view;
//	 

	@RequestMapping(value = "/addPost", method = RequestMethod.POST)
	public ModelAndView addPost(@ModelAttribute("post") Post post) {
		System.out.println("inside homeC");

		ModelAndView view = new ModelAndView("resources/viewPosts");
		ModelAndView view1 = new ModelAndView("resources/addPost");

		boolean res = pImpl.insert(post);

		System.out.println(res);
		if (res) {
			return view;
		} else {
			return view1;
		}
	}

	@RequestMapping(value = "/updatePost", method = RequestMethod.POST)
	public ModelAndView updatePost(@ModelAttribute(value = "pid") int pid, @ModelAttribute("title") String title,
			@ModelAttribute("body") String body) {
		System.out.println("insiupdate");
		ModelAndView view = new ModelAndView("resources/viewPosts");
		ModelAndView view1 = new ModelAndView("resources/updatePost");
		int res = pImpl.update(new Post(pid, title, body, 0));
		System.out.println(res);
		if (res == 1) {
			return view;
		} else {
			return view1;
		}

	}


 @RequestMapping(value = "/deletePost", method = RequestMethod.GET)

public ModelAndView addPost(@RequestParam(value = "pid") int pid)
{
int res = pImpl.delete(pid);
 String result = (res == 1) ? "post deleted" : "post couldn't be deleted";
 ModelAndView view = new ModelAndView("result"); 
view.addObject("result",result); 
 return view;
}
 
//	@RequestMapping(value = "/deletePost", method = RequestMethod.GET)
//	public ModelAndView deletePost(@ModelAttribute("pid") int pid) {
//		System.out.println("inside delete ");
//		 ModelAndView view= new  ModelAndView("/result");
//		
//		int res = pImpl.delete(pid);
//		if(res==1) {
//			return view;
//		}
//		else
//			return new ModelAndView("resources/deletePost");
//		
//
//	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchPost(@ModelAttribute("title") String title) {
		System.out.println("inside search");
		
		List<Post> list = pImpl.search(title);
		ModelAndView view = new ModelAndView("resources/search");
		view.addObject("list", list);
		return view;
	}

	@RequestMapping(value = "/viewPosts", method = RequestMethod.GET)
	public ModelAndView viewPosts() throws SQLException {
		System.out.println("Inside viewwwww");
		List<Post> list = pImpl.view();
		try {
			list = pImpl.view();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		ModelAndView view = new ModelAndView("resources/viewPosts");
		view.addObject("list", list);
		return view;
}

///////////////////////////////////////////////for comments impl\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

	@RequestMapping(value = "/addComment", method = RequestMethod.POST)
	public ModelAndView addComment(@ModelAttribute("comments") Comments comments) {
		System.out.println("inside coommm");
		System.out.println(comments);

		ModelAndView view = new ModelAndView("resources/viewComments");
		ModelAndView view1 = new ModelAndView("resources/addComment");

		int res = cImpl.insertComment(comments);

		System.out.println(res);
		if (res == 1) {
			return view;
		} else {
			return view1;
		}
	}
	
	
	
	
	


	@RequestMapping(value = "/viewComments", method = RequestMethod.GET)

	public ModelAndView viewComments() throws SQLException {
		System.out.println("Inside viewwwww");
		List<Comments> list = cImpl.view();
		try {
			list = cImpl.view();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ModelAndView view = new ModelAndView("resources/viewComments");
		view.addObject("list", list);
		return view;
	}
	
	
	


	@RequestMapping(value = "/deleteComment", method = RequestMethod.POST)
	public ModelAndView deleteComment(@RequestParam(value = "cid") int cid) {
		System.out.println("inside HomeCcc");
		ModelAndView view = new ModelAndView("resources/viewComments");
		int res = cImpl.deleteComment(cid);
		System.out.println(res);

		if(res==1) {
           return view;
		
		}
		return new ModelAndView("resources/deleteComment");
	}

	@RequestMapping(value = "/searchComment", method = RequestMethod.GET)
	public ModelAndView searchComments(@ModelAttribute("pid") int pid) {
		System.out.println("inside search comments");

		List<Comments> list = cImpl.searchComments(pid);
		ModelAndView view = new ModelAndView("resources/searchComment");
		view.addObject("list", list);
		return view;
	}
	
	
	///////////////////////////////////////////// user
	///////////////////////////////////////////// impl\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public ModelAndView signIn(@ModelAttribute("email") String email, @ModelAttribute("password") String password) {

		boolean res = uImpl.signIn(email, password);
		System.out.println("login: " + res);
		
		ModelAndView view = new ModelAndView("resources/home");
	
		ModelAndView view1 = new ModelAndView("/resources/signIn");
		if (res) {

			return view;
		} else {
			return view1;
		}

	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public ModelAndView signUp(@ModelAttribute("username") String username, @ModelAttribute("email") String email,
			@ModelAttribute("password") String password, @ModelAttribute("confirmpassword") String confirmpassword) {

		ModelAndView view1 = new ModelAndView("/resources/signUp");
		ModelAndView view = new ModelAndView("resources/home");

		boolean res = uImpl.signUp(new User(0, username, email, password));
		System.out.println(res);
		if (res) {

			return view;
		} else {
			return view1;
		}

	}

	@RequestMapping(value = "/viewUser", method = RequestMethod.GET)
	public ModelAndView viewUsers() {

		List<User> list = null;
		try {
			list = uImpl.view();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ModelAndView view = new ModelAndView("/views/view_all");
		view.addObject("list", list);
		return view;
	}

}
