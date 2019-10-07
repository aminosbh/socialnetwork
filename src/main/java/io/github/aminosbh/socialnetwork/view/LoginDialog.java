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

package io.github.aminosbh.socialnetwork.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class LoginDialog extends JDialog {

  private final JPanel contentPanel = new JPanel();
  private JTextField fldLogin;
  private JTextField fldPassword;

  /**
   * Create the dialog.
   */
  public LoginDialog() {
    setModal(true);
    setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    setTitle("Social Network - Login");
    setBounds(100, 100, 273, 152);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
        ColumnSpec.decode("77px"),
        FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
        ColumnSpec.decode("114px:grow"),},
      new RowSpec[] {
        FormSpecs.UNRELATED_GAP_ROWSPEC,
        RowSpec.decode("21px"),
        FormSpecs.LINE_GAP_ROWSPEC,
        RowSpec.decode("21px"),}));
    {
      JLabel lblLogin = new JLabel("Login:");
      contentPanel.add(lblLogin, "1, 2, left, center");
    }
    {
      fldLogin = new JTextField();
      contentPanel.add(fldLogin, "3, 2, fill, top");
      fldLogin.setColumns(10);
    }
    {
      JLabel lblPassword = new JLabel("Password:");
      contentPanel.add(lblPassword, "1, 4, left, center");
    }
    {
      fldPassword = new JTextField();
      contentPanel.add(fldPassword, "3, 4, fill, top");
      fldPassword.setColumns(10);
    }
    {
      JPanel buttonPane = new JPanel();
      buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
      getContentPane().add(buttonPane, BorderLayout.SOUTH);
      {
        JButton btnLogin = new JButton("Login");
        btnLogin.setActionCommand("OK");
        buttonPane.add(btnLogin);
        getRootPane().setDefaultButton(btnLogin);
      }
      {
        JButton btnQuit = new JButton("Quit");
        btnQuit.setActionCommand("Cancel");
        buttonPane.add(btnQuit);
      }
    }
  }

}
