package io.schultz.dustin.todoapp.custom;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class ProjectInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("applicationName", "ToDoApplication")
                .withDetail("team","Sastra")
                .withDetail("pointOfContact","rajesht07@techera.org");
    }
}
