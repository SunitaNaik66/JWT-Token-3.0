package com.jwt.models;

public class JwtResponse {
    private String jwtToken;
    private String user;

    // Builder pattern
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String jwtToken;
        private String user;

        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public JwtResponse build() {
            JwtResponse response = new JwtResponse();
            response.jwtToken = this.jwtToken;
            response.user = this.user;
            return response;
        }
    }

    // Getters
    public String getJwtToken() {
        return jwtToken;
    }

    public String getUser() {
        return user;
    }
}