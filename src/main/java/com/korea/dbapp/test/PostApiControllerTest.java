package com.korea.dbapp.test;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.korea.dbapp.domain.post.PostRepository;
import com.korea.dbapp.domain.post.Post;

@RestController
public class PostApiControllerTest {
	
	private final PostRepository postRepository;

	public PostApiControllerTest(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}
	
	@GetMapping("/test/post")
	public List<Post>findAll() {
		return postRepository.findAll();
	}
	
	@GetMapping("/test/post/{id}")
	public Post findById(@PathVariable int id) {
		return postRepository.findById(id).get();
	}

}
