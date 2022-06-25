package com.noel.board.controller;

import com.noel.board.dto.PostDto;
import com.noel.board.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    private static final Logger logger = LoggerFactory.getLogger(PostController.class);
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPost(@PathVariable("id") long id) {
        logger.info("getPost");
        try {
            PostDto postDto = postService.getPost(id);
            return ResponseEntity.ok(postDto);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("")
    public ResponseEntity<?> getPostList() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("")
    public ResponseEntity<?> createPost(@RequestBody PostDto postDto) {
        postService.createPost(postDto);
        return ResponseEntity.ok().build();
    }
    @PutMapping("{id}")
    public ResponseEntity<?> updatePost(@PathVariable("id") long id, @RequestBody PostDto postDto) {
        try {
            postService.updatePost(id, postDto);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deletePost(@PathVariable("id") long id) {
        try {
            postService.removePost(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
