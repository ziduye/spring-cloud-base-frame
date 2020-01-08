package me.ziduye.frame.core.persist.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import me.ziduye.frame.core.persist.ValidGroup;
import me.ziduye.frame.core.persist.base.entity.BaseEntity;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataEntity<T> extends BaseEntity<T> {

	@NotNull(message = "创建时间", groups = ValidGroup.Save.class)
	protected LocalDateTime createTime;
	@NotNull(message = "创建人", groups = ValidGroup.Save.class)
	protected String createUser;

	@NotNull(message = "更新时间", groups = ValidGroup.Update.class)
	protected LocalDateTime updateTime;
	@NotNull(message = "更新人", groups = ValidGroup.Update.class)
	protected String updateUser;

}





