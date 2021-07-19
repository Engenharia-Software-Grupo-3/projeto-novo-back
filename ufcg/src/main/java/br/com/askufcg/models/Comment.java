package br.com.askufcg.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor @Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity @Table(name = "tb_comment")
public class Comment {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Long id;
    private String content;
    private Date createdAt;

    @ManyToOne
    private User author;
}