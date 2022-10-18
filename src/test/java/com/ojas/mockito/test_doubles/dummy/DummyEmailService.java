package com.ojas.mockito.test_doubles.dummy;

import com.ojas.mockito.fake_doubles.dummy.EmailService;

public class DummyEmailService implements EmailService {

    @Override
    public void sendEmail(String message) {
        throw new AssertionError("Method not implemented");
    }
}
