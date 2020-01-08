package me.ziduye.frame.core.persist.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
public class BaseEntity<T> implements Serializable {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    @NotNull(message = "id不能为空")
    protected T id;

}
