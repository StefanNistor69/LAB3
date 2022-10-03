public class DesignDepartment extends Department{
    private String NewIdeas;
    private String ReviewedIdeas;
    private String Projects;

    public String getNewIdeas(){
        System.out.println(this.NewIdeas);
        return this.NewIdeas;
    }
    public void setNewIdeas(String newIdeas){
        this.NewIdeas=newIdeas;
    }
    public String getReviewedIdeas(){
        System.out.println(this.ReviewedIdeas);
        return this.ReviewedIdeas;
    }
    public void setReviewedIdeas(String reviewedIdeas){
        this.ReviewedIdeas=reviewedIdeas;
    }
    public String getProjects(){
        System.out.println(this.Projects);
        return this.Projects;
    }
    public void setProjects(String projects){
        this.Projects=projects;
    }
}
