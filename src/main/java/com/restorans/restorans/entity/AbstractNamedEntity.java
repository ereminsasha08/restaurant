package com.restorans.restorans.entity;

import com.restorans.restorans.HasId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@MappedSuperclass
@Access(AccessType.FIELD)
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractNamedEntity extends AbstractBaseEntity{

    protected String name;


    @Override
    public String toString() {
        return super.toString() + '(' + name + ')';
    }


}
