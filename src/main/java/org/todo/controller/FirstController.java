package org.todo.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FirstController {
    @GetMapping("/")
    public String index(@RequestParam(name="name", required = false) String visitorName, Model model){
        if(visitorName == null || visitorName.isEmpty()) {
            model.addAttribute("name", "홍길동");
        } else {
            model.addAttribute("name", visitorName);
        }

        //배열 선언
        List<Dream> dreamList = new ArrayList<>();

        //하위 객체 생성
        Dream dream1 = new Dream(10, "세계 최강");
        Dream dream2 = new Dream(20, "돈 많은 백수");

        //하위 배열 추가
        dreamList.add(dream1);
        dreamList.add(dream2);

        //Model 추가
        model.addAttribute("dreams", dreamList);

        String[] hobbies = {"웹소설", "노래", "유튜브", "자각몽", "산책", "고양이랑 놀기", "지나가는 강아지 쳐다보기"};
        model.addAttribute("hobbies", hobbies);
        return "greeting.html";
    }



    private class Dream {
        @Getter
        private int age;
        @Getter
        private String wanted;

        public Dream(int age, String wanted) {
            this.age = age;
            this.wanted = wanted;
        }
    }

}
