package com.oocl.test.power_test.repository;

import com.oocl.test.power_test.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface messageRepository extends JpaRepository<Message,String> {

}
