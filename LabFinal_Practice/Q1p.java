package LabFinal_Practice;

import java.util.ArrayList;

class Issue<T> {
    private ArrayList<T> issues;
    public Issue(T issue)
    {
        issues.add(issue);
    }

    public ArrayList<T> getIssues() {
        return issues;
    }
}
class Admin{
    private String issue;
    public Admin(String issue)
    {
        this.issue=issue;
    }

    public String getIssue() {
        return issue;
    }
}
class HR{
    private String issue;
    public HR(String issue)
    {
        this.issue=issue;
    }

    public String getIssue() {
        return issue;
    }
}
class Technical{
    private String issue;
    public Technical(String issue)
    {
        this.issue=issue;
    }

    public String getIssue() {
        return issue;
    }
}

public class Q1p {
    Issue<Technical> technicalIssue = new Issue<>(new Technical("t"));
    Issue<HR> hrIssue = new Issue<>(new HR("hr"));
    Issue<Admin> adminIssue = new Issue<>(new Admin("admin"));

}
