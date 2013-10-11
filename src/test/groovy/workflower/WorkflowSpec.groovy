package workflower

import spock.lang.Specification

class WorkflowSpec extends Specification {

    def "On start, the position in a workflow is the start step of the workflow"() {
        given:
        def start = new Step()
        def workflow = new Workflow(start)

        when:
        def position = workflow.start()

        then:
        position
        position.step == start
        position.step.workflow == workflow
    }
}

