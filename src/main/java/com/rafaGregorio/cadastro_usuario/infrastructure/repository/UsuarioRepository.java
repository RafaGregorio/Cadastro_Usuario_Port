package com.rafaGregorio.cadastro_usuario.infrastructure.repository;

import com.rafaGregorio.cadastro_usuario.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Criado como Optional porque ele evita o nullpointerexception.
    // Obrigado a criar uma exeção ou uma alternativa caso o email nõo exista.
    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
