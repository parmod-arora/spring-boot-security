package com.parmodarora.service.currentuser;

import com.parmodarora.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
