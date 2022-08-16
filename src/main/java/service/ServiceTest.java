package service;

import org.springframework.stereotype.Service;

@Service
public interface ServiceTest {
    void insert(String data);

    void update(String data);

    void delete(String data);

    void select(String data);
}
