package springBatch;


import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserProcessor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) throws Exception{
        System.out.println("p enter");

        user.setEmail(user.getEmail().toLowerCase());
        System.out.println("🔄 Processing User: " + user); // Convert email to lowercase
        return user;
    }



}
