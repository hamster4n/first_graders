package controller.command;

import view.View;

@FunctionalInterface
public interface CommandSupplier <C extends Command>{
    C get (View view);
}
