package com.example.gate2innovate.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChangePasswordDTO {

    private String currentPassword;
    private String newPassword;
    private String confirmationPassword;
}
