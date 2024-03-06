package com.spring.jwt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "carVerified")
public class CarVerified {


   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "CarVerifiedId", nullable = false)
   private int CarVerifiedId;

   @Column(name = "id")
   private int id;

   @Column(name = "partName")
   private  String partName;

   @Column(name = "PartCondition")
   private  String PartCondition;


}
