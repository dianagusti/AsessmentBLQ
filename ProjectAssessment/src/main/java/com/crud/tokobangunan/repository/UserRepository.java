package com.crud.tokobangunan.repository;

import com.crud.tokobangunan.model.DataUser;

public interface UserRepository {
    DataUser getDataUser(String username);
}
