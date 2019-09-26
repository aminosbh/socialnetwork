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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User implements ContactItem {

  private String login;
  private String password;
  
  private String firstName;
  private String lastName;
  private Date dateOfBirth;
  private Gender gender;
  
  private List<Photo> photos = new ArrayList<>();
  private List<Location> locations = new ArrayList<>();
  private List<Email> emails = new ArrayList<>();
  private List<PhoneNumber> phoneNumbers = new ArrayList<>();
  private List<ContactItem> contacts = new ArrayList<>();
  
  public User(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public User(String login, String password, String firstName, String lastName,
      Date dateOfBirth, Gender gender) {
    
    this.login = login;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public List<Photo> getPhotos() {
    return photos;
  }

  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }

  public void addPhoto(Photo photo) {
    photos.add(photo);
  }

  public void removePhoto(Photo photo) {
    photos.remove(photo);
  }

  public List<Location> getLocations() {
    return locations;
  }

  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }

  public void addLocation(Location location) {
    locations.add(location);
  }

  public void removeLocation(Location location) {
    locations.remove(location);
  }

  public List<Email> getEmails() {
    return emails;
  }

  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }

  public void addEmail(Email email) {
    emails.add(email);
  }

  public void removeEmail(Email email) {
    emails.remove(email);
  }

  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public void addPhoneNumber(PhoneNumber phoneNumber) {
    phoneNumbers.add(phoneNumber);
  }

  public void removePhoneNumber(PhoneNumber phoneNumber) {
    phoneNumbers.remove(phoneNumber);
  }

  public List<ContactItem> getContacts() {
    return contacts;
  }

  public void setContacts(List<ContactItem> contacts) {
    this.contacts = contacts;
  }

  public void addContact(ContactItem contact) {
    contacts.add(contact);
  }

  public void removeContact(ContactItem contact) {
    contacts.remove(contact);
  }
}
