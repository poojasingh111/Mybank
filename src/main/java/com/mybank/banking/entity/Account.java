package com.mybank.banking.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="accounts")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name="Customer_Name")
private String cusName;
private double balance;
}
