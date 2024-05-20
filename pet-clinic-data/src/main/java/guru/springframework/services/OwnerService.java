package guru.springframework.services;

import guru.springframework.modal.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastname);
}
