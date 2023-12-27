package org.acme.users;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"id", "fullName", "age", "gender", "email", "phone", "username", "birthDate", "height", "weight", "address", "company"})
public class ExternalUser {
    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private String gender;

    private String email;

    private String phone;

    private String username;
    private String birthDate;

    private float height;

    private float weight;

    private Direccion address;

    private Company company;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @JsonbProperty("NombreCompleto")
    public String getFullName(){return firstName+" " + lastName;}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonbProperty("Edad")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @JsonbProperty("Genero")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonbProperty("Correo Electronico")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("Telefono")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonbProperty("Usuario")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonbProperty("FechaNacimiento")
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonbProperty("Altura")
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @JsonbProperty("Peso")
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @JsonbProperty("Direccion")
    public Direccion getAddress() {
        return address;
    }

    public void setAddress(Direccion address) {
        this.address = address;
    }

    @JsonbProperty("Trabajo")
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public static class Direccion  {

        private String address;
        private String city;
        private String postalCode;

        @JsonbProperty("direccion")
        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @JsonbProperty("Ciudad")
        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @JsonbProperty("CodigoPostal")
        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }


    }

    public static class Company {
        private Direccion address;
        private String department;
        private String name;

        @JsonbProperty("direccion")
        public Direccion getAddress() {
            return address;
        }

        public void setAddress(Direccion address) {
            this.address = address;
        }

        @JsonbProperty("Departamento")
        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        @JsonbProperty("NombreDepartamento")
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @JsonbProperty("Posicion")
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        private String title;
    }
}
