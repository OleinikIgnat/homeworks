/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginframetester;

public class User {
    private String password;
    private String login;
    public String toString()
    {
        return "password: " + password + ", login: " + login;
    }
    public Person(String password, String login)
    {
        this.password = password;
        this.login = login;
    }
}
