import org.demoproject.Model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallRestService implements CommandLineRunner {

    private static RestTemplate restTemplate = new RestTemplate();
    private static final Logger LOGGER = LoggerFactory.getLogger(CallRestService.class);

    public void run(String... args) {

                getEmployee();

    }

    /*private static void postTopic()
    {
        Topic topic = new Topic("myTopic","myTopic", "myTopic");
        HttpEntity<Topic> entity = new HttpEntity<Topic>(topic);
        ResponseEntity<Topic> response = restTemplate.postForEntity(
                "http://localhost:8080/topics", entity, Topic.class);
        LOGGER.info(topic.getName() + " was sucessfully added");
    }*/

    public void getEmployee()
    {
        Employee employee = restTemplate.getForObject("http://localhost:8080/employees/5a803b453cde64a8c4eea9ce", Employee.class);
        LOGGER.info(employee.getFirstName() + " was sucessfully extracted");
        System.out.println("oops");
    }

    /*private void getTopic()
    {
        retryTemplate.execute(context -> {
            Topic topic = restTemplate.getForObject("http://localhost:8080/topics/del", Topic.class);
            System.out.println("trying to retry");
            LOGGER.info(topic.getName() + " was sucessfully extracted");
            return null;
        },
                (RecoveryCallback<Throwable>) retryContext -> {
                    Topic topic = new Topic("del","del", "del");
                    HttpEntity<Topic> entity = new HttpEntity<Topic>(topic);
                    ResponseEntity<Topic> response = restTemplate.postForEntity(
                            "http://localhost:8080/topics", entity, Topic.class);
                    System.out.println("problem solved");
                    getTopic();
                    return null;
                }
        );
    }*/

    /*private static void putTopic()
    {
        Topic topicold = restTemplate.getForObject("http://localhost:8080/topics/myTopic", Topic.class);
        String topicoldId = topicold.getId();
        Topic topic = new Topic(topicoldId, "newTopic", "newTopic");
        HttpEntity<Topic> entity = new HttpEntity<Topic>(topic);
        restTemplate.put(
                "http://localhost:8080/topics{id}", entity, "/myTopic");
        LOGGER.info(topic.getName() + " was sucessfully updated");
    }

    private static void deleteTopic()
    {
        restTemplate.delete("http://localhost:8080/topics{id}", "/myTopic");
        LOGGER.info("topic ee was sucessfully deleted");
    }*/

}