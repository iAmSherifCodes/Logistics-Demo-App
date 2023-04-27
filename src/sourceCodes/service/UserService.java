package sourceCodes.service;

import sourceCodes.data.model.User;
import sourceCodes.dto.requests.RegisterUserRequest;
import sourceCodes.dto.responses.RegisterUserResponse;

public interface UserService {
    RegisterUserResponse registerNewUser(RegisterUserRequest registerUserRequest);
    User findUser(int id);

}
