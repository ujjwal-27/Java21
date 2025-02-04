package com.example.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Lombok is a Java Library that helps reduce the boilerplate code by automatically generating common methods required in a model class.
 * It implements several annotation for it.
 * @Data - Automatically generates methods like getter, setter, toString, equals, and hashCode.
 * @AllArgsConstructor - Automatically generates parameterized constructor with all the class properties defined in its parameter.
 * @NoArgsConstructor - Automatically generates default constructor.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;
}
