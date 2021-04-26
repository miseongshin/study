package com.web1028.study.whiteship.javaBasic;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.List;

//https://github-api.kohsuke.org/
//참여율을 계산하세요. 총 18회에 중에 몇 %를 참여했는지 소숫점 두자리가지 보여줄 것
public class GitApi {

    private String MY_USER = "miseongshin";
    private String MY_PASSWD = "";



    public static void main(String[] args) throws IOException {

        GitApi gitApi = new GitApi();
        gitApi.run();
    }

    private void run() throws IOException {

        GitHub github = new GitHubBuilder().withPassword(MY_USER, MY_PASSWD).build();
        GHRepository repo = github.getRepository("miseongshin/algo_python");
        int repo_count = repo.getOpenIssueCount();
        int comment_count;
        for (int i = 1; i < repo_count +1; i++) {
            GHIssue issue =repo.getIssue(i);
            comment_count =issue.getCommentsCount();
            List<GHIssueComment> comments = issue.getComments();

            for (int j = 0; j < comments.size(); j++) {
                System.out.println(comments.get(j).getBody());
            }
        }






    }


}
