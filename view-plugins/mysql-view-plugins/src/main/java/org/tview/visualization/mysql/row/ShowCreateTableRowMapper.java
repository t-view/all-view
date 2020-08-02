package org.tview.visualization.mysql.row;

import org.springframework.jdbc.core.RowMapper;
import org.tview.visualization.model.db.ShowCreateTable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowCreateTableRowMapper implements RowMapper<ShowCreateTable> {

  @Override
  public ShowCreateTable mapRow(ResultSet resultSet, int i) throws SQLException {
    return new ShowCreateTable(resultSet.getString("Table"), resultSet.getString("Create Table"));
  }
}
