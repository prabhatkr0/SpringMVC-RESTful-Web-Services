package com.webservice.mobile.app.service.impl;


import com.webservice.mobile.app.exceptions.UserServiceException;
import com.webservice.mobile.app.io.entity.UserEntity;
import com.webservice.mobile.app.io.repositories.UserRepository;
import com.webservice.mobile.app.service.UserService;
import com.webservice.mobile.app.shared.Utils;
import com.webservice.mobile.app.shared.dto.UserDTO;
import com.webservice.mobile.app.ui.model.response.ErrorMessages;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

  ;
        

    
        return returnValue;
    }

  
    }

    @Transactional
    @Override
    public void deleteUser(String userId) {

        UserEntity  userEntity = userRepository.findByUserId(userId);
        if (userEntity == null) throw new
                UserServiceException((ErrorMessages.NO_RECORD_FOUND.getErrorMessage()));
        userRepository.delete(userEntity);

    }

    @Override
    public List<UserDTO> getUsers(int page, int limit) {

        List<UserDTO> returnValue = new ArrayList<>();

       


        return returnValue;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserEntity userEntity= userRepository.findUserByEmail(email);
        if (userEntity ==null)throw new UsernameNotFoundException(email);

        return new User(userEntity.getEmail(),userEntity.getEncryptedPassword(),new ArrayList<>());
    }
}
