/*
 * Copyright (C) 2019 Amine Ben Hassouna <amine.benhassouna@gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this work except in compliance with the License.
 * You may obtain a copy of the License in the LICENSE file, or at:
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.aminosbh.socialnetwork.repositories;

import java.util.ArrayList;
import java.util.List;

import io.github.aminosbh.socialnetwork.entities.User;

public class UserRepository {
  
  private List<User> users = new ArrayList<>();

  private static UserRepository repository = null;

  public static UserRepository getInstance() {
    if (repository == null) {
      repository = new UserRepository();
    }
    return repository;
  }

  private UserRepository() {}

  public void add(User user) {
    users.add(user);
  }
  
  public void remove(User user) {
    users.remove(user);
  }
  
  public List<User> findAll() {
    return users;
  }

  public User findByLoginAndPassword(String login, String password) {
    
    for (User user : users) {
      if (user.getLogin().equals(login)) {
        if (user.getPassword().contentEquals(password)) {
          return user;
        } else {
          return null;
        }
      }
    }
    
    return null;
  }
  
  public User findByFirstName(String firstName) {
    
    for (User user : users) {
      if(user.getFirstName().equals(firstName)) {
        return user;
      }
    }
    
    return null;
  }
}
