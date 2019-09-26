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

public class PhoneNumber {

  private int countryCallingCode;
  private long number;
  private String label;
  
  public PhoneNumber(int countryCallingCode, long number) {
    this.countryCallingCode = countryCallingCode;
    this.number = number;
  }

  public PhoneNumber(int countryCallingCode, long number, String label) {
    this.countryCallingCode = countryCallingCode;
    this.number = number;
    this.label = label;
  }

  public int getCountryCallingCode() {
    return countryCallingCode;
  }

  public void setCountryCallingCode(int countryCallingCode) {
    this.countryCallingCode = countryCallingCode;
  }

  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}
