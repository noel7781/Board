import React from 'react';

function SidebarItem({ category }) {
  return (
    <div className='sidebar-item'>
      <p>{category.name}</p>
    </div>
  );
}

export default SidebarItem;
