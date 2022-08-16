package service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceTest {
    @Override
    public void insert(String data) {
        System.out.println("insert"+data);
    }

    @Override
    public void update(String data) {
        System.out.println("update"+data);
    }

    @Override
    public void delete(String data) {
        System.out.println("delete"+data);
    }

    @Override
    public void select(String data) {
        System.out.println("select"+data);


    }
}
