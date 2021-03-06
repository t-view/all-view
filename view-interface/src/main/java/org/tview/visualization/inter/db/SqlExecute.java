package org.tview.visualization.inter.db;

import java.util.List;
import org.tview.visualization.model.db.DBConnectionConfig;
import org.tview.visualization.model.res.ExecuteRes;

public interface SqlExecute {

  /**
   * 执行sql
   *
   * @param connectionConfig 链接配置
   * @param sql sql语句
   * @return
   */
  ExecuteRes execute(DBConnectionConfig connectionConfig, String sql);

  List<String> history();
}
