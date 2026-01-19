package com.debby.peminjaman.application.commands;

import com.debby.peminjaman.application.Command;
import com.debby.peminjaman.dto.CommandResult;

/**
 * Command for deleting a Peminjaman
 * Returns CommandResult (CQRS compliant)
 */
public class DeletePeminjamanCommand implements Command<CommandResult> {
    private final Long id;

    public DeletePeminjamanCommand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
