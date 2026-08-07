package com.example.demo;

import lombok.*;

@Getter
@Setter
@Data
final class SignupData {
    public String Name;
    public String Password; // Fixed spelling
    public int Number;
    public String Email;
}

