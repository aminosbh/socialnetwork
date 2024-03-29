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

package io.github.aminosbh.socialnetwork;

import io.github.aminosbh.socialnetwork.entities.User;
import io.github.aminosbh.socialnetwork.view.LoginDialog;

public class Main {

  public static void main(String[] args) {
    
    LoginDialog loginDialog = new LoginDialog();
    loginDialog.setVisible(true);
    
    User user = loginDialog.getUser();
    if (user != null) {
      System.out.println("User '" + user + "' logged in");
    }

    System.out.println("Exit");
  }

}
