package springBatch;


import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserProcessor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) throws Exception{

        user.setEmail(user.getEmail().toLowerCase());
        return user;
    }



}
