package br.com.appfrontreactandbackspring.model;

import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuarionome")
    private String usuarionome;

    @Column(name = "descricao")
    private String descricao;

    public Curso() {
    }

    public Curso(Long id, String usuarionome, String descricao) {
        this.id = id;
        this.usuarionome = usuarionome;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsuarionome() {
        return usuarionome;
    }
    public void setUsuarionome(String usuarionome) {
        this.usuarionome = usuarionome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((usuarionome == null) ? 0 : usuarionome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (usuarionome == null) {
            if (other.usuarionome != null)
                return false;
        } else if (!usuarionome.equals(other.usuarionome))
            return false;
        return true;
    }

    
}
