package my.nvinz.ds;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectDriver {
    private List<Project> projects;

    public ProjectDriver(List<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public List<Project> getProjects() {
        return projects;
    }
}
