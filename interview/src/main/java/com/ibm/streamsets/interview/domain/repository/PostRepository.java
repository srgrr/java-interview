package com.ibm.streamsets.interview.domain.repository;

import com.ibm.streamsets.interview.domain.Post;

public interface PostRepository {
  Post savePost(Post post);
  Post getPost(String postId);
  Post deletePost(String postId);
}
