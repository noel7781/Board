package com.noel.board.service;

import com.noel.board.dto.PostDto;
import com.noel.board.entity.Comment;
import com.noel.board.entity.Post;
import com.noel.board.entity.User;
import com.noel.board.repository.PostRepository;
import com.noel.board.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.parseLong;

@Service
public class PostService {

    private static final Logger logger = LoggerFactory.getLogger(PostService.class);
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public void createPost(PostDto postDto) {
        logger.info("Before createPost, repo size: " + postRepository.findAll().size());
        Post newPost = new Post();
        newPost.setTitle(postDto.getTitle());
        newPost.setContent(postDto.getContent());
        // 유저 있을시 이렇게 바꿀예정
//        newPost.setAuthor(userRepository.findByUsername(postDto.getAuthor()));

        newPost.setBoardKind(postDto.getBoardKind());
        newPost.setCreatedAt(postDto.getCreatedAt());
        newPost.setUpdatedAt(postDto.getUpdatedAt());
        newPost.setComments(new ArrayList<Comment>());
        postRepository.save(newPost);

        logger.info("After createPost, repo size: " + postRepository.findAll().size() + ", newPost Id: " + newPost.getId());
    }

    public PostDto getPost(long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid post id"));
        PostDto postDto = new PostDto();

        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setContent(post.getContent());
//        postDto.setAuthor(post.getAuthor().getUsername());
        postDto.setBoardKind(post.getBoardKind());
        postDto.setCreatedAt(post.getCreatedAt());
        postDto.setUpdatedAt(post.getUpdatedAt());
        return postDto;

    }

    public List<PostDto> getPostList() {
        return null;

    }

    public void updatePost(long id, PostDto postDto) {
        Post post = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid post id"));
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setBoardKind(postDto.getBoardKind());
        post.setUpdatedAt(postDto.getUpdatedAt());
        postRepository.save(post);
    }

    public void removePost(long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid post id"));
        postRepository.delete(post);
    }

}
