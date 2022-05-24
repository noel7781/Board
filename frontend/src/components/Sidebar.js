// src/components/Sidebar.js

import React from 'react';
import { NavLink } from 'react-router-dom';
import styled from 'styled-components';
import SidebarItem from './SidebarItem';

const Side = styled.div`
  display: flex;
  border-right: 1px solid #e0e0e0;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 20%;
`;
const Category = styled.div`
  display: flex;
  flex-direction: column;
`;

function Sidebar() {
  const categories = [
    { name: '국내', path: '/korea' },
    { name: '아시아', path: '/asia' },
    { name: '유럽', path: '/europe' },
    { name: '미국/캐나다', path: '/north-america' },
    { name: '남미', path: '/south-america' },
    { name: '호주', path: '/australia' },
    { name: '아프리카/중동', path: '/africa-me' },
  ];
  return (
    <Side>
      <Category>
        {categories.map((category, index) => {
          return (
            <NavLink
              exact
              style={{
                color: 'gray',
                textDecoration: 'none',
                fontSize: '3vh',
              }}
              to={category.path}
              key={index}
              activeStyle={{ color: 'black' }}
            >
              <SidebarItem category={category} />
            </NavLink>
          );
        })}
      </Category>
    </Side>
  );
}

export default Sidebar;
