package workflower;

public class Workflow {

    private final Step start;

    public Workflow(Step start) {
        this.start = start;
        start.setWorkflow(this);
    }

    public Position start() {
        return new Position(start);
    }
}
