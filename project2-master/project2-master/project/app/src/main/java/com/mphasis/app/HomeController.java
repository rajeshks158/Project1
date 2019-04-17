package com.mphasis.app;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.PostDAOImpl;
import dao.UserDAOImpl;
import model.Comment;
import model.Post;
import model.User;
import dao.CommentDAOImpl;
import dao.ConnectorUtility;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	PostDAOImpl postimpl = new PostDAOImpl();
	CommentDAOImpl comimpl = new CommentDAOImpl();
	UserDAOImpl userimp1 = new UserDAOImpl();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("serverTime", new Date());

		return "resources/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("User_name") String User_name,
			@ModelAttribute("Password") String Password) {
		System.out.println("djfbegvfeuihfwiefhoweg");

		ModelAndView view1 = new ModelAndView("resources/login");
		boolean res = userimp1.login(User_name, Password);
		if (res) {

			ModelAndView view = new ModelAndView("resources/Home");
			return view;

		} else {
			return view1;
		}

	}



	@RequestMapping(value = "/Signup", method = RequestMethod.POST)
	public ModelAndView signUp(@ModelAttribute("User_name") String User_name,
			@ModelAttribute("firstname") String firstname, @ModelAttribute("lastname") String lastname,
			@ModelAttribute("email") String email, @ModelAttribute("password") String password,
			@ModelAttribute("confirmpassword") String confirmpassword) {
		System.out.println("hgfdtyrd");
		ModelAndView view = new ModelAndView("resources/Signup");
		if (password.equals(confirmpassword)) {
			boolean res = userimp1.signUp(new User(0, User_name, firstname, lastname, email, password));
			if (res) {
				ModelAndView view1 = new ModelAndView("resources/login");
				return view1;
			} else {
				return view;
			}
		} else {
			return view;
		}
	}
	
	

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user(@RequestParam(value = "User_name") String userName) {
		ModelAndView view = new ModelAndView("user");
		view.addObject("User_name", userName);
		return view;
	}
	
	

	@RequestMapping("/addpost")
	public ModelAndView addPost() {

		return new ModelAndView("add", "command", new Post());
	}

	
	@RequestMapping(value = "/AddPost", method = RequestMethod.POST)
	public ModelAndView addPost(@ModelAttribute("Post") Post post) {
		System.out.println(post);
		ModelAndView view = new ModelAndView("resources/AddPost");
		ModelAndView view1 = new ModelAndView("resources/ViewAllPosts");

		int res = postimpl.insert(post);
		if (res == 1) {
			return view1;

		} else

			return view;
	}

	@RequestMapping(value = "/EditPost", method = RequestMethod.POST)
	public ModelAndView editPost(@ModelAttribute("Post_id") int Post_id, @ModelAttribute("Title") String Title,
			@ModelAttribute("Body") String Body) {

		ModelAndView view = new ModelAndView("resources/EditPost");
		ModelAndView view1 = new ModelAndView("resources/ViewAllPosts");

		int res = postimpl.update(new Post(Post_id, Title, Body, 0));
		System.out.println(res);
		if (res == 1) {
			return view1;

		} else

			return view;
	}

	@RequestMapping(value = "/ViewAllPosts", method = RequestMethod.GET)
	public ModelAndView viewPosts() {

		List<Post> list = null;
		try {
			list = postimpl.view();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		ModelAndView view = new ModelAndView("view_all");
		view.addObject("list", list);
		return view;
	}

	@RequestMapping(value = "/DeletePost", method = RequestMethod.GET)
	public ModelAndView deletePost(@ModelAttribute(value = "Post_id") int Post_id) {
		System.out.println("post will be deleted");
		int res = postimpl.delete(Post_id);
		String result = (res == 1) ? "post deleted" : "post couldn't be deleted";
		ModelAndView view = new ModelAndView("resources/DeletePost");
		ModelAndView view1 = new ModelAndView("resources/ViewAllPosts");
		if (res == 1) {
//			view.addObject("",result); 
			return view1;
		} else {
			return view;
		}
	}
	

	@RequestMapping(value = "/SearchPost", method = RequestMethod.GET)
	public ModelAndView searchPost(@ModelAttribute("Post_id") int Post_id) {
		System.out.println("inside search");
		
		List<Post> list = postimpl.view(Post_id);
		ModelAndView view = new ModelAndView("resources/SearchPost");
		view.addObject("list", list);
		return view;
	}
	

	@RequestMapping(value = "/AddComment", method = RequestMethod.POST)
	public ModelAndView addComment(@ModelAttribute("Comment") Comment comment) {
		System.out.println(comment);
		ModelAndView view = new ModelAndView("resources/AddComment");
		ModelAndView view1 = new ModelAndView("resources/ViewAllComments");

		int res = comimpl.insert(comment);
		if (res == 1) {
			return view1;

		} else

			return view;
	}
	
	@RequestMapping(value = "/EditComment", method = RequestMethod.POST)
	public ModelAndView editComment(@ModelAttribute("C_id") int C_id, @ModelAttribute("Com_body") String Com_body) {

		ModelAndView view = new ModelAndView("resources/EditComment");
		ModelAndView view1 = new ModelAndView("resources/ViewAllComments");

		int res = comimpl.update(new Comment(C_id, Com_body,0,0));
		System.out.println(res);
		if (res == 1) {
			return view1;

		} else

			return view;
	}

	@RequestMapping(value = "/DeleteComment", method = RequestMethod.GET)
	public ModelAndView deleteComment(@ModelAttribute(value = "C_id") int C_id) {
		System.out.println("comment will be deleted");
		int res = comimpl.delete(C_id);
		
		ModelAndView view = new ModelAndView("resources/DeleteComment");
		ModelAndView view1 = new ModelAndView("resources/ViewAllComments");
		if (res == 1) {
//			view.addObject("",result); 
			return view1;
		} else {
			return view;
		}
	}
	
	@RequestMapping(value = "/ViewAllComments", method = RequestMethod.GET)
	public ModelAndView viewComments() {

		List<Comment> list = null;
		try {
			list = comimpl.view();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		ModelAndView view = new ModelAndView("view_all");
		view.addObject("list", list);
		return view;
	}
	

	@RequestMapping(value = "/SearchComment", method = RequestMethod.GET)
	public ModelAndView searchComment(@ModelAttribute("C_id") int C_id) {
		System.out.println("inside comment search");
		List<Comment> list = comimpl.view(C_id);

		ModelAndView view = new ModelAndView("resources/SearchComment");
		view.addObject("list", list);
		return view;
	}

}