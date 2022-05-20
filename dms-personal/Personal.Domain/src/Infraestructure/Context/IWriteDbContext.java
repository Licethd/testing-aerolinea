package Infraestructure.Context;

import Domain.Model.Tripulante.Cargo;
import Domain.Model.Tripulante.Tripulante;
import SharedKernel.db.DbContext;
import SharedKernel.db.DbSet;

public abstract class IWriteDbContext extends DbContext {

    public IWriteDbContext(Class dbContextClass) {
        super(dbContextClass);
    }

    public DbSet<Tripulante> Tripulante;
    public DbSet<Cargo> Cargo;
}
