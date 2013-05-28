/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.cockpit.auth;


/**
 * <p>An authentication provider implements a method for authenticating principals.</p>
 * 
 * @author Daniel Meyer
 * 
 */
public interface AuthenticationProvider {

  /**
   * <p>Authenticate a principal given the provided credentials.</p>
   * 
   * @param username
   * @param credential
   * @return the current {@link AuthenticatedPrincipal}
   * @throws AuthenticationException
   *           if the passed in token cannot be authenticated
   */
  public AuthenticatedPrincipal authenticate(AuthenticationToken token) throws AuthenticationException;

}