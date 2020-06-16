package com.cos.mlb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Mlb {
        private int id; 
        private String team; 
        private String player; 
        private String position;
}
