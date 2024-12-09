package com.ibm.streamsets.interview.infrastructure;

import com.ibm.streamsets.interview.domain.Post;
import com.ibm.streamsets.interview.domain.repository.PostRepository;
import jakarta.inject.Singleton;

import java.util.HashMap;
import java.util.Map;

@Singleton
public class InMemoryPostRepository implements PostRepository {

  Map<String, Post> memory = new HashMap<>();

  @Override
  public Post savePost(Post post) {
    memory.put(post.id(), post);
    return post;
  }

  @Override
  public Post getPost(String postId) {
    return memory.get(postId);
  }

  @Override
  public Post deletePost(String postId) {
    Post post = memory.get(postId);
    memory.remove(postId);
    return post;
  }
}
